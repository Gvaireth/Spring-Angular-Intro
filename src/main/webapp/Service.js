angularIntro.factory('service', function($http) {
	var service = this;
	return {
		getGreetings : function(name) {
			return $http.get('/SpringAngularIntro/getGreetings/'+name);
		},
		getInfo : function(name) {
			return $http.get('/SpringAngularIntro/getInfo/');
		}
	}
});