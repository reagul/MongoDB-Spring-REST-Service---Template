## MongoDB Spring REST Service - Template 
Author: Ravi Jagannathan  

This is an example of a REST service that loads and stores json data using Mongo DB. 

### Preparations
Mongo DB  and TOMCAT must be installed on your local machine. MongoDB is assumed to run on Localhost.

### Feature highlights
- Rest service with CRUD support.
- Mongo DB 2.4.9 for loading and storing json data.
- Spring Framework 4.0.0
- Jersey 1.18
- Spring context is configured by Java configuration (instead of xml configuration)

### Testing Mongo DB via the REST service

First of all, you must start Mongo DB on your local machine:

```
> cd <mongodb_home_dir>
> cd bin
> mongod.exe
```
```
Make sure the MongoDB has a Database Called EMCRESTDB and collection called "contact". T
We are assuming that MongoDB service will run on Localhost on port 27017.
Better to pre-populate the Collection "contact" with dummy data.
Start with GET and progress from there to POST / PUT / DELETE 
Here is a sample JSON Data you can insert and GET.

```
```
{
    "firstName" : "Handsome",
    "lastName" : "Paul",
    "contactphone" : "5088989923",
    "email" : "paul.haul@emc.com",
    "city" : "NYCity",
    "state" : "NY",
    "phone" : "5088989923"
}
```

Use the REST service as a Template for any API. The REST API created here is a Contacts API service.
Once Installed on TOMCAT / JBOSS / WEBSPHERE it will provide these API out of the BOX.

```
GET http://192.168.1.24:8080/ETAPP-REST-1/contacts
```
GET will get all contacts in the Databse EMCRESTDB and collection contact. 

```
The API supports PUT / DELETE / POST.
```
Modify to suite your API needs.
```
- Point to MongoDB running on remote server by mpdifying the Localhost param found in MongoDB config class.
- Change the model class to suite your own model. Here we are assuming the "contact" model with example JSON agiven above.
```