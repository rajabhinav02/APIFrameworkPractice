Feature: Add Place


Scenario: Verify if place has been succesfully added using AddPlace API
	Given Add Place Payload
	When user calls "AddPlaceAPI" with "Post" http request
	Then the API call is success with status code 200
	And status message is OK