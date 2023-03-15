
/* 2078614
 *	Yash Shah
 * Optionally, if you have any comments regarding your submission, put them here. 
 * For instance, specify here if your program does not generate the proper output or does not do it in the correct manner.
 */

import java.util.*;
import java.io.*;

class Vertex implements Comparable<Vertex> {

	// Constructor: set name, chargingStation and index according to given values,
	// initilaize incidentRoads as empty array
	public Vertex(String placeName, boolean chargingStationAvailable, int idx) {
		name = placeName;
		incidentRoads = new ArrayList<Edge>();
		index = idx;
		chargingStation = chargingStationAvailable;
	}

	public String getName() {
		return name;
	}

	public boolean hasChargingStation() {
		return chargingStation;
	}

	public ArrayList<Edge> getIncidentRoads() {
		return incidentRoads;
	}

	// Add a road to the array incidentRoads
	public void addIncidentRoad(Edge road) {
		incidentRoads.add(road);
	}

	public int getIndex() {
		return index;
	}

	public boolean isVisited() { // MY ADDITION -------------------
		return visited;
	}

	public void setVisited(boolean visited) {  // MY ADDITION -------------------
		this.visited = visited;
	}

	public Vertex getPredecessor() {
		return predecessor;
	}

	public void setPredecessor(Vertex predecessor) { // MY ADDITION -------------------
		this.predecessor = predecessor;
	}

	public int getDistance() { // MY ADDITION -------------------
		return distance;
	}

	public void setDistance(int distance) { // MY ADDITION -------------------
		this.distance = distance;
	}

	@Override
	public int compareTo(Vertex otherVertex) {
		return Integer.compare(this.distance, otherVertex.getDistance());
	}

	private String name; // Name of the place
	private ArrayList<Edge> incidentRoads; // Incident edges
	private boolean chargingStation; // Availability of charging station
	private int index; // Index of this vertex in the vertex array of the map
	private boolean visited; // MY ADDITION -------------------------
	private Vertex predecessor; // MY ADDITION ---------------------
	private int distance = Integer.MAX_VALUE; // MY ADDITION -------------------

}

class Edge {
	public Edge(int roadLength, Vertex firstPlace, Vertex secondPlace) {
		length = roadLength;
		incidentPlaces = new Vertex[] { firstPlace, secondPlace };
	}

	public Vertex getFirstVertex() {
		return incidentPlaces[0];
	}

	public Vertex getSecondVertex() {
		return incidentPlaces[1];
	}

	public int getLength() {
		return length;
	}

	private int length;
	private Vertex[] incidentPlaces;
}

// A class that represents a sparse matrix
public class RoadMap {

	// Default constructor
	public RoadMap() {
		places = new ArrayList<Vertex>();
		roads = new ArrayList<Edge>();
	}

	// Auxiliary function that prints out the command syntax
	public static void printCommandError() {
		System.err.println("ERROR: use one of the following commands");
		System.err.println(" - Read a map and print information: java RoadMap -i <MapFile>");
		System.err.println(
				" - Read a map and find shortest path between two vertices with charging stations: java RoadMap -s <MapFile> <StartVertexIndex> <EndVertexIndex>");
	}

	public static void main(String[] args) throws Exception {
		if (args.length == 2 && args[0].equals("-i")) {
			RoadMap map = new RoadMap();
			try {
				map.loadMap(args[1]);
			} catch (Exception e) {
				System.err.println("Error in reading map file");
				System.exit(-1);
			}

			System.out.println("Read road map from " + args[1] + ":");
			map.printMap();
		} else if (args.length == 4 && args[0].equals("-s")) {
			RoadMap map = new RoadMap();
			map.loadMap(args[1]);
			System.out.println("Read road map from " + args[1] + ":");
			map.printMap();

			int startVertexIdx = -1, endVertexIdx = -1;
			try {
				startVertexIdx = Integer.parseInt(args[2]);
				endVertexIdx = Integer.parseInt(args[3]);
			} catch (NumberFormatException e) {
				System.err.println("Error: start vertex and end vertex must be specified using their indices");
				System.exit(-1);
			}

			if (startVertexIdx < 0 || startVertexIdx >= map.numPlaces()) {
				System.err.println("Error: invalid index for start vertex");
				System.exit(-1);
			}

			if (endVertexIdx < 0 || endVertexIdx >= map.numPlaces()) {
				System.err.println("Error: invalid index for end vertex");
				System.exit(-1);
			}

			Vertex startVertex = map.getPlace(startVertexIdx);
			Vertex endVertex = map.getPlace(endVertexIdx);
			if (!map.isConnectedWithChargingStations(startVertex, endVertex)) {
				System.out.println();
				System.out.println("There is no path connecting " + map.getPlace(startVertexIdx).getName() + " and "
						+ map.getPlace(endVertexIdx).getName() + " with charging stations");
			} else {
				ArrayList<Vertex> path = map.shortestPathWithChargingStations(startVertex, endVertex);
				System.out.println();
				System.out.println("Shortest path with charging stations between " + startVertex.getName() + " and "
						+ endVertex.getName() + ":");
				map.printPath(path);
			}

		} else {
			printCommandError();
			System.exit(-1);
		}
	}

	// Load matrix entries from a text file
	public void loadMap(String filename) {
		File file = new File(filename);
		places.clear();
		roads.clear();

		try {
			Scanner sc = new Scanner(file);

			// Read the first line: number of vertices and number of edges
			int numVertices = sc.nextInt();
			int numEdges = sc.nextInt();

			for (int i = 0; i < numVertices; ++i) {
				// Read the vertex name and its charing station flag
				String placeName = sc.next();
				int charginStationFlag = sc.nextInt();
				boolean hasChargingStataion = (charginStationFlag == 1);

				// Add your code here to create a new vertex using the information above and add
				// it to places

				Vertex newVertex = new Vertex(placeName, hasChargingStataion, i);
				places.add(newVertex);
			}

			for (int j = 0; j < numEdges; ++j) {
				// Read the edge length and the indices for its two vertices
				int vtxIndex1 = sc.nextInt();
				int vtxIndex2 = sc.nextInt();
				int length = sc.nextInt();
				Vertex vtx1 = places.get(vtxIndex1);
				Vertex vtx2 = places.get(vtxIndex2);

				// Add your code here to create a new edge using the information above and add
				// it to roads
				// You should also set up incidentRoads for each vertex

				// Start: vtx1
				// End: vtx 2
				// vtx1 ---------- length -----------> vtx2
				// Need to do the reverse for vtx2 to add a incident road to it vtx1
				Edge newEdge = new Edge(length, vtx1, vtx2);
				roads.add(newEdge);
				vtx1.addIncidentRoad(newEdge);
				Edge newEdgeReverse = new Edge(length, vtx2, vtx1);
				vtx2.addIncidentRoad(newEdgeReverse);
			}

			sc.close();

			// Add your code here if approparite
		} catch (Exception e) {
			e.printStackTrace();
			places.clear();
			roads.clear();
		}
	}

	// Return the shortest path between two given vertex, with charging stations on
	// each itermediate vertex.
	public ArrayList<Vertex> shortestPathWithChargingStations(Vertex startVertex, Vertex endVertex) {

		// Initialize an empty path
		ArrayList<Vertex> path = new ArrayList<Vertex>();

		// Sanity check for the case where the start vertex and the end vertex are the
		// same
		if (startVertex.getIndex() == endVertex.getIndex()) {
			path.add(startVertex);
			return path;
		}

		// Add your code here
		else {
			DijkstraShortestPath shortestPath = new DijkstraShortestPath();
			shortestPath.computeShortestPaths(startVertex);
			return (ArrayList<Vertex>) shortestPath.getShortestPathTo(endVertex);
		}
	}

	public static class DijkstraShortestPath {
		public void computeShortestPaths(Vertex sourceVertex) {
			sourceVertex.setDistance(0);
			PriorityQueue<Vertex> priorityQueue = new PriorityQueue<Vertex>();
			priorityQueue.add(sourceVertex);
			sourceVertex.setVisited(true);

			while (!priorityQueue.isEmpty()) {
				Vertex actualVertex = priorityQueue.poll();

				for (Edge edge : actualVertex.getIncidentRoads()) {
					Vertex v = edge.getSecondVertex();
					if (!v.isVisited()) {
						int newDistance = actualVertex.getDistance() + edge.getLength();

						if (newDistance < v.getDistance()) {
							priorityQueue.remove(v);
							v.setDistance(newDistance);
							v.setPredecessor(actualVertex);
							priorityQueue.add(v);
						}
					}
				}
				actualVertex.setVisited(true);
			}
		}

		public List<Vertex> getShortestPathTo(Vertex targetVertex) {
			List<Vertex> path = new ArrayList<Vertex>();

			for (Vertex vertex = targetVertex; vertex != null; vertex = vertex.getPredecessor()) {
				path.add(vertex);
			}

			Collections.reverse(path);
			return path;
		}

	}



	public boolean BFS(Vertex startVertex, Vertex endVertex) {
		HashSet<Vertex> visited = new HashSet<Vertex>();
		Queue<Vertex> adjacent = new LinkedList<Vertex>();
		adjacent.add(startVertex);
		
		while(!adjacent.isEmpty()) {
			Vertex current = adjacent.remove();
			if (current == endVertex) {
				return true;
			}
			for (int i = 0; i < current.getIncidentRoads().size(); i++) {
				ArrayList<Edge> adjacentRoads = current.getIncidentRoads();
				Edge adjRoad = adjacentRoads.get(i);
				Vertex adjacentVertex = adjRoad.getSecondVertex();
				if (!visited.contains(adjacentVertex)) {
					adjacent.add(adjacentVertex);
				}
			}
			visited.add(current);
		}
		return false;
	}


	// Check if two vertices are connected by a path with charging stations on each itermediate vertex.
	// Return true if such a path exists; return false otherwise.
	// The worst-case time complexity of your algorithm should be no worse than O(v + e),
	// where v and e are the number of vertices and the number of edges in the graph.
	public boolean isConnectedWithChargingStations(Vertex startVertex, Vertex endVertex) {
		// Sanity check
		if (startVertex.getIndex() == endVertex.getIndex()) {
			return true;
		}

		// Add your code here
		else{
			boolean bfs = BFS(startVertex, endVertex);
			// System.out.println(bfs);
			return bfs;

		}
	}



	public void printMap() {
		System.out.println("The map contains " + this.numPlaces() + " places and " + this.numRoads() + " roads");
		System.out.println();

		System.out.println("Places:");

		for (Vertex v : places) {
			System.out.println("- name: " + v.getName() + ", charging station: " + v.hasChargingStation());
		}

		System.out.println();
		System.out.println("Roads:");

		for (Edge e : roads) {
			System.out.println("- (" + e.getFirstVertex().getName() + ", " + e.getSecondVertex().getName()
					+ "), length: " + e.getLength());
		}
	}

	public void printPath(ArrayList<Vertex> path) {
		System.out.print("(  ");

		for (Vertex v : path) {
			System.out.print(v.getName() + "  ");
		}

		System.out.println(")");
	}

	public int numPlaces() {
		return places.size();
	}

	public int numRoads() {
		return roads.size();
	}

	public Vertex getPlace(int idx) {
		return places.get(idx);
	}

	private ArrayList<Vertex> places;
	private ArrayList<Edge> roads;
}
