angularIntro.controller('mainController', function($scope, service) {
	service.getGreetings('world').then(function(result) {
		$scope.greetings = result.data.text;
	});
});