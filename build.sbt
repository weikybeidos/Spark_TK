name := "Spark_TK"

version := "1.0"

scalaVersion := "2.10.5"

resolvers +="Cloudera" at "https://repository.cloudera.com/artifactory/cloudera-repos/"

libraryDependencies += "org.apache.spark" % "spak-assembly_2.10" % "1.6.0-cdh5.8.5"