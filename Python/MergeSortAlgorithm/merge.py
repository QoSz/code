def merge_sort(list):
    """
    Sorts a list in ascending order
    :returns a new sorted list

    Divide: Find the midpoint of the list and divide it into two sublists
    Conquer: Recursively sort the sublists created in the previous step
    Merge: Merge the sorted sublists created in the previous step
    """

    if len(list) <= 1:
        return list

    left_half, right_half = split(list)
    left = merge_sort(left_half)
    right = merge_sort(right_half)

    return merge(left, right)


def split(list):
    """
    :param list: Divide the unsorted list at the midpoint into sublists
    :return: Returns two sublists - left and right
    """

    midpoint = len(list) // 2
    left = list[:midpoint]
    right = list[midpoint:]

    return left, right


def merge(left, right):
    """
    :param: Merges two lists (arrays), sorting them in the process
    :return: Returns a new merged list
    """

    l = []
    left_index = 0
    right_index = 0

    while left_index < len(left) and right_index < len(right):
        if left[left_index] < right[right_index]:
            l.append(left[left_index])
            left_index += 1
        else:
            l.append(right[right_index])
            right_index += 1

    while left_index < len(left):
        l.append(left[left_index])
        left_index += 1

    while right_index < len(right):
        l.append(right[right_index])
        right_index += 1

    return l


def verify_sorted(list):
    n = len(list)
    if n == 0 or n == 1:
        return True

    return list[0] < list[1] and verify_sorted(list[1:])


alist = [54, 26, 93, 17, 77, 31, 44, 55, 20]
l = merge_sort(alist)
print(verify_sorted(alist))
print(verify_sorted(l))
