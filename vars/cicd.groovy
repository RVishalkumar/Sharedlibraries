def gitDownload(repo)
{
	git "https://github.com/RVishalkumar/${repo}.git"
}
def mavenBuild()
{
	sh "mvn package"
}
def tomcatDeploy(jobname,ip,context)
{
	sh " scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat10/webapps/${context}.war"
}
def executeSelenium(jobname)
{
	sh "java -jar /var/lib/jenkins/workspace/${jobname}/testing.jar"
}
