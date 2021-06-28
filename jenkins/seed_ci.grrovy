pipelineJob("$jobname") {
    definition { cps { script("""

  pipeline {
    agent any

    stages {
     stage("scm") {
       steps {
        echo "clone your repo"
       }
      }
     stage("build") {
       steps {
         echo "build your job"
        }
     }
     stage("deploy") {

       steps {
         echo " deployment stage"
       }
     }
   }
  }
 """)
   }
  }
  triggers {
        cron('*/1 * * * *')
    }
 }
