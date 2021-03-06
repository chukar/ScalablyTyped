package typings.surveyDashKnockout.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "DragDropInfo")
@js.native
class DragDropInfo protected () extends js.Object {
  def this(source: IElement, target: IElement) = this()
  def this(source: IElement, target: IElement, nestedPanelDepth: Double) = this()
  var destination: ISurveyElement = js.native
  var isBottom: Boolean = js.native
  var isEdge: Boolean = js.native
  var nestedPanelDepth: Double = js.native
  var source: IElement = js.native
  var target: IElement = js.native
}

