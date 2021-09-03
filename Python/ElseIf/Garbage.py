weight = int(input("Enter the weight of your garbage in kilograms here: "))

if weight <= 1:
    print("Garbage will not be collected this week")
elif weight <= 9:
    print("Please separate the garbage into the proper bins for collection on Tuesday")
elif weight >= 10:
    print("Garbage will be collected today you will get a notification on your \nphone notifying you what time the "
          "garbage will be picked at")
else:
    print("Please enter a number for the weight of your garbage!")
