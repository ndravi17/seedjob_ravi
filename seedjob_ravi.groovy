multibranchPipelineJob('seedjob_ravi1') {
    branchSources {
        git {
            //*remote('https://github.com/jenkinsci/job-dsl-plugin.git')
            remote('https://github.com/ndravi17/seedjob_ravi.git')
            //credentialsId('github-ci')
            //includes('JENKINS-*')
        }
    }
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(20)
        }
    }
}
