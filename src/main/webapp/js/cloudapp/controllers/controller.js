var app = angular.module('app', ['ngRoute']);



app.controller('controller', function($scope, $rootScope,$filter,$location,$http,$window) {
$scope.register=false;
$scope.userName="";
$scope.password="";

$scope.student={
  userName:$scope.userName,
  password:$scope.password
}




	$scope.signIn = function(){

	      var onSuccess = function (data, status, headers, config) {
                            alert('Student saved successfully.');
                        };

                        var onError = function (data, status, headers, config) {
                            alert('Error occured.');
                        }

         $http.post('/login', {
                                userName:$scope.userName,
                                password:$scope.password
                              })

                            .then(function(response){

                                $window.location.href="/home"
                            },function(error){

                            })
	}
	$scope.clickRed=function(){
	    $location.path("/red");
	}

});

app.config(['$routeProvider',function($routeProvider) {
	$routeProvider
		.when('/home', {
			templateUrl: '/views/homePage.html',
			controller: 'loginController'
		})


		.otherwise({
			redirectTo: '/'
		});
}]);




