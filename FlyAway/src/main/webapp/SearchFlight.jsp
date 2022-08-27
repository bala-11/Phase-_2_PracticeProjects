<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Flight</title>
</head>
<body>

    <div>
        
        <h1>Welcome to FlyAway</h1>
        <br>
        
        Ticket Booking 
        <br>
        
       
    
    </div>
    
    
   <form action="SearchFlight" method="post">
    
        <div>
          
          
            <label for="date">Date</label>
          <input type="date"   id="date" name="date" placeholder="yyyy-mm-dd..">
        
        
        </div>
        
        <div>
          <label for="source">Source</label>
                    <select  id="source" name="source">
                        <option value="India">India</option>
                        <option value="China">China</option>
                        <option value="Australia">Australia</option>
                        <option value="Dubai">Dubai</option>
                        <option value="Russia">Russia</option>
                    </select>
        
        
        </div>
        
        
        <div>
        
           <label for="destination">Destination</label>
                    <select  id="destination" name="destination">
                        <option value="USA">USA</option>
                        <option value="UK">UK</option>
                        <option value="India">India</option>
                        <option value="Armenia">Armenia</option>
                        <option value="Pakistan">Pakistan</option>
                    </select>
        </div>
        <div>
        
          <label for="persons">No of Persons</label>
                    <select id="persons" name="persons">
                        <option value="1">1</option>
                        <option value="2">2</option>
                        <option value="3">3</option>
                        <option value="4">4</option>
                        <option value="5">5</option>
                        <option value="6">6</option>
                        <option value="7">7</option>
                        <option value="8">8</option>
                           
                    </select>
        </div>
         <button type="submit"  value="Submit">Search Flights</button>
    </form>
</body>
</html>