environments {

dev {
		server {
			localHomeDir = '/usr/local/apache-tomcat-8.0.24-dev'
			containerId = 'tomcat8x'
			hostname = 'ec2-54-169-82-188.ap-southeast-1.compute.amazonaws.com'
			port = 8091
			context = appName
			username = 'tomcat'
			password = 's3cret'
		}
}
qa {
		server {
			localHomeDir = '/usr/local/apache-tomcat-8.0.24-qa'
			containerId = 'tomcat8x'
			hostname = 'ec2-54-169-82-188.ap-southeast-1.compute.amazonaws.com'
			port = 8092
			context = appName
			username = 'tomcat'
			password = 's3cret'
		}
	}
perf {
		server {
			localHomeDir = '/usr/local/apache-tomcat-8.0.24-perf'
			containerId = 'tomcat8x'
			hostname = 'ec2-54-169-82-188.ap-southeast-1.compute.amazonaws.com'
			port = 8093
			context = appName
			username = 'tomcat'
			password = 's3cret'
		}
	}
stage {
		server {
			localHomeDir = '/usr/local/apache-tomcat-8.0.24-stage'
			containerId = 'tomcat8x'
			hostname = 'ec2-54-169-82-188.ap-southeast-1.compute.amazonaws.com'
			port = 8094
			context = appName
			username = 'tomcat'
			password = 's3cret'
		}
	}
prod {
		server {
			localHomeDir = '/usr/local/apache-tomcat-8.0.24-prod'
			containerId = 'tomcat8x'
			hostname = 'ec2-54-169-82-188.ap-southeast-1.compute.amazonaws.com'
			port = 8095
			context = appName
			username = 'tomcat'
			password = 's3cret'
		}
	}
}
