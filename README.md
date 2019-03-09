###New York Cab Rides Project

### Overview:
Cab Data Researcher is a company that provides insights on the open data about NY cab trips

 
Cab trips in NY are public available as csv downloadable files. In order to make it more useful we want to wrap the data in a public API.


### Data 
Data format is as follow:

 
medallion, hack_license, vendor_id, rate_code, store_and_fwd_flag, pickup_datetime, dropoff_datetime, passenger_count, trip_time_in_secs, trip_distance

 
The medallion is the cab identification.

### API Requirement 
Our API should provide a way to query how many trips a particular cab (medallion) has made given a particular pickup date ( using pickup_datetime and only considering the date part)
 
The API must receive one or more medallions and return how many trips each medallion has made.

Considering that the query creates a heavy load on the database, the results must be cached.

The API must allow user to ask for fresh data, ignoring the cache.

There must be also be a method to clear the cache.
 
### Utilities 
What do we provide:
	
SQL statements to populate database from the csv

### Solution
This is a Java 8 based Spring Boot REST API

### Running the application
- Run the project: <code>mvn spring-boot:run</code>

### Accessing the application
* Support page: (http://localhost:8080)
* Development console for H2 in memory db: http://localhost:8080/h2
* Rest APIs: http://localhost:8080/rides
  * searching example: http://localhost:8080/rides/search/findTripsByMedallion?medallion=D7D598CD99978BD012A87A76A7C891B7&date=2013-12-01
 

### Optimisation
- Add support to query multiple cabs at a time
- Implement a REST Query language for additional flexibility on searching and filtering for new requirements
- Expose Spring cache management for user intervention if required 

### Production implementation
 - Replace in-memory DB, H2 with an enterprise DB or an open source DB
 - Add ID to SQL data
 - Export SQL to Production DB
 - Configure production application.properties
 - Remove or disable Spring Devtools dependency as needed
 - Configure Spring Security authentication (users) and authorisation (roles)
 - Add dockerfile
 - Setup CI/CD pipeline
 - Deploy to server
 - Update documentation
