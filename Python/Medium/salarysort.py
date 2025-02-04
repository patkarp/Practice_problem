
import csv
class Salarysort:
    try:
        csvfile=open("/Users/patkarp/Documents/Coding/Practice_problem/Python/Medium/salarysort.csv","r")
        reader=csv.DictReader(csvfile)
        
        # Convert the reader to a list of dictionaries
        data = list(reader)
        print(data)

        if 'Salary' not in reader.fieldnames:
            print("Salary column not found")
        
        sorted_data=sorted(data,key=lambda x:float(x['Salary']), reverse=True)

        print(sorted_data)

        for row in sorted_data:
            print(row)
    
    except FileNotFoundError:
        print(f"File '{file_path}' not found. Please check the path and try again.")
    except ValueError as e:
        print(f"Error processing the file: {e}")
    except Exception as e:
        print(f"An unexpected error occurred: {e}")