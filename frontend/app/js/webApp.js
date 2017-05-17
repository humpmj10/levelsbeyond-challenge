var app = angular.module('app', ['ngRoute', 'ngResource', 'door3.css', 'ui.bootstrap']);

app.constant('baseUrl', 'https://https://developer.github.com/v3/');

app.config(['$routeProvider', '$locationProvider', function($routeProvider, $locationProvider) {

	$routeProvider.
		when('/home', {
			templateUrl: '../views/index.html'
		}).
		otherwise({
			redirectTo: '/home'
		});
}]);