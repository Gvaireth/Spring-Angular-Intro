angularIntro.controller('mainController', function($scope, service) {
	$scope.status = 'loading...';
	service.getGreetings().then(function(result) {
		$scope.greetings = result.data;
		$scope.status = '';
	});

});