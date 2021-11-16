# NewsApi
A rest REST API for querying and retrieving scoped news and information. 


## API Features

  1. Users can create departments.
  2. Users can create general news
  3. Users can create department news
  4. Users can see information/ properties of other users
  5. Users can see all the users in a deartment as well as the news in the department
  6. Users can post news relating to a department

### Dependencies

    1. [junit-jupiter-api] 'org.junit.jupiter:junit-jupiter-api:5.8.1'
    2. [junit-jupiter-engine] 'org.junit.jupiter:junit-jupiter-engine:5.8.1'
    3. [spark-core] 'com.sparkjava:spark-core:2.9.3'
    4. [slf4j-simple] 'org.slf4j:slf4j-simple:1.7.32'
    5. [gson] 'com.google.code.gson:gson:2.8.9'
    6. [sql2o]  group: 'org.sql2o', name: 'sql2o', version: '1.5.4'
    7. [postgresql] group: 'org.postgresql', name: 'postgresql', version: '42.2.2'    

   


## Getting Started

    1. git clone https://github.com/Chal13W1zz/NewsApi.git

    2. cd NewsApi

    3. edit postgresql username and password in App.java 

    4. run psql < create.sql in the project root to create the database

    5. gradle run 


## Tests
    1. cd NewsApi
    2. gradle test

## API Endpoints


| EndPoint                                |   Functionality                      |
| --------------------------------------- | ------------------------------------:|
| POST /departments/new                   | Create a new department              |
| GET /departments                        | View departments                     |
| POST /GeneralNews/new                   | Post Generel News                    |
| GET /news/articles/posts                | View all general news                |
| POST /news/:departmentId/new            | Create department scoped news        |
| GET /news/:departmentId                 | View department scoped news          |
| POST /users/new                         | Create a new uaser                   |
| GET /users                              | View created users                   |



## Request & Response examples
Request curl

```curl
curl --location --request POST 'https://allnews-api.herokuapp.com/departments/new' \
--header 'Content-Type: application/json' \
--data-raw '{
    "departmentName": "Tech",
    "departmentDescription": "It'\''s all about tech",
    "employees": 20
}'
```

Response (application/json)
```curl
{
    "id": 1,
    "departmentName": "Tech",
    "departmentDescription": "It's all about tech",
    "employees": 20
}
```


## Limitations

  1. The API only responds with JSON

## Contribution

1. Fork it! :fork_and_knife:
2. Create your feature branch: `git checkout -b my-new-feature`
3. Commit your changes: `git add -A && git commit -m 'Add some feature'`
4. Push to the branch: `git push origin my-new-feature`
5. Submit a pull request

