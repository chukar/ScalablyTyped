package typings.arcgisDashJsDashApi.esriWidgetsLineOfSightMod

import typings.arcgisDashJsDashApi.__esri.LineOfSight
import typings.arcgisDashJsDashApi.__esri.LineOfSightProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/widgets/LineOfSight", JSImport.Namespace)
@js.native
/**
  * The LineOfSight widget is a 3D analysis tool that allows you to perform visibility analysis in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). Visibility between a given observer and multiple target points is calculated against the currently displayed content in the view, including ground, integrated meshes and 3D objects such as buildings or trees.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LineOfSight.html)
  */
class Class () extends LineOfSight {
  def this(properties: LineOfSightProperties) = this()
}

