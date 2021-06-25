def baseUrl = "https://github.com/ybmadhu/"
def repoName = "$reponame"
def gitRepoUrl= baseUrl + repoName + '.git'
def jobName = "$reponame"
  pipelineJob(jobName) {
        definition {
            cpsScm {
                scm {
                    git {
                        remote {
                            url(gitRepoUrl)
                            //credentials('credentailsID')
                        }
                        branches('master')
                        extensions {
                            cleanBeforeCheckout()
                        }
                    }
                }
                triggers {
                  cron("H/1 * * * *")
                 }
                scriptPath("Jenkinsfile")
            }
        }
    }
