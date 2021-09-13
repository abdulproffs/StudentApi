$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/feature/Student.feature");
formatter.feature({
  "name": "Student Rest API",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "User Calls Student Rest API to check Student Id Exist or not",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@FetchStudentById"
    }
  ]
});
formatter.step({
  "name": "Request with Id \"101\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdef.FetchStudentById.Student_Exist(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Student gets retrieve by id",
  "keyword": "And "
});
formatter.match({
  "location": "stepdef.FetchStudentById.Student_Retrieve()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate status code will be 200",
  "keyword": "When "
});
formatter.match({
  "location": "stepdef.FetchStudentById.verify_stat_code(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Print Response",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdef.FetchStudentById.Print_Response()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User Calls Student Rest API to get all Student details",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@FetchAllStudents"
    }
  ]
});
formatter.step({
  "name": "hit the url",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdef.FetchAllStudents.Student_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "get Student Details",
  "keyword": "And "
});
formatter.match({
  "location": "stepdef.FetchAllStudents.Student_Details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate status code as 200",
  "keyword": "When "
});
formatter.match({
  "location": "stepdef.FetchAllStudents.verfy_stat_code(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "print Response body",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdef.FetchAllStudents.Print_Response_bd()"
});
formatter.result({
  "status": "passed"
});
});