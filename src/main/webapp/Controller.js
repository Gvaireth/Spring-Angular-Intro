angularIntro.controller('controller', function($scope, service) {
	$scope.greetings="loading..."
	service.getGreetings('world').then(function(result) {
		$scope.greetings = result.data.text;
	});
	service.getInfo().then(function(result) {
		$scope.info = result.data.msg;
	});
});