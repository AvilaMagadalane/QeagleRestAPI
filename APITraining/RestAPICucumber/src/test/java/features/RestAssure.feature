Feature: RestAssure
Scenario: Create Incident

Given Set Base URI
And Get Authentication as 'admin' and 'h*@gB4CK2wwM'
When Create incident with requestbody '{"short_description": "test"}'
Then Validate the status code as 201

Scenario: Update Incident

Given Set Base URI
And Get Authentication as 'admin' and 'h*@gB4CK2wwM'
When Update incident with requestbody '{"short_description": "testDescription"}'
Then Validate the status code as 200

Scenario: Get Incident

Given Set Base URI
And Get Authentication as 'admin' and 'h*@gB4CK2wwM'
When Get all incidents
Then Validate the status code as 200

Scenario: Delete Incident

Given Set Base URI
And Get Authentication as 'admin' and 'h*@gB4CK2wwM'
When Delete incidents
Then Validate the status code as 204


