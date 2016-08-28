angularIntro.factory('service', function($http) {
	var service = this;
	return {
		getGreetings : function(name) {
			return $http.get('/AngularIntro/getGreetings/'+name);
		}
	}
});