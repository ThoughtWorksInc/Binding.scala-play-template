enablePlugins(PlayScala)

lazy val js = project

scalaJSProjects += js

pipelineStages in Assets += scalaJSPipeline

libraryDependencies += "com.vmunier" %% "scalajs-scripts" % "1.0.0"
