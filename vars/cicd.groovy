def gitDownload(repo)
{
	git "https://github.com/RVishalkumar/${repo}.git"
}
def mavenBuild()
{
	sh "mvn package"
}
