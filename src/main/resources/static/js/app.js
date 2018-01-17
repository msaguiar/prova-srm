var app = angular.module('app', [ 'ngRoute', 'ngResource' ]);

app.config(function($routeProvider) {

	$routeProvider.when('/', {
		templateUrl : 'views/credito.html',
		controller : 'CreditoCtrl',
	}).otherwise({
		redirectTo : '/'
	});
});
app.factory('Risco', function($resource) {
	return $resource('/api/risco/', {}, {
		query : {
			url : '/api/risco/listar',
			method : 'GET',
			isArray : true

		}
	});
});

app.factory('Credito', function($resource) {
	return $resource('/api/credito/', {}, {});
});
