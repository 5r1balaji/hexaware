'use strict';

app.controller('loginController', function($scope, $filter,$location,$rootScope,$http) {

$scope.user=$rootScope.userDetails;
console.log("hello");
$scope.welcome="abc"
	$scope.getUserScores = function(){

        $http.get("/rest/userscore/"+$scope.user.employeeId).
        then(function(response){
                $scope.userScores=response.data;
        },
        function(error){
        });

	}


$scope.getSession = function(){

        $http.get("/session").
        then(function(response){
                $rootScope.userDetails=response.data;
                $scope.user=$rootScope.userDetails;
                $scope.getUserScores();
        },
        function(error){
        });

	}




});