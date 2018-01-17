app.controller('CreditoCtrl', function($scope, Risco, Credito) {

	$scope.riscosList = null;
	$scope.credito = {}
	Risco.query({}, function(riscos) {
		if (riscos != null) {
			$scope.riscosList = riscos;
			$scope.credito.riscoId = riscos[0].id;
		}
	});

	$scope.salvar = function() {
		Credito.save($scope.credito);

	}

});