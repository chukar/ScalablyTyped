package typings.postmanDashCollection.postmanDashCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.postmanDashCollection.postmanDashCollectionMod.PropertyBaseDefinition because Already inherited
- typings.postmanDashCollection.postmanDashCollectionMod.PropertyDefinition because Already inherited
- typings.postmanDashCollection.postmanDashCollectionMod.FormParamDefinition because var conflicts: description, disabled, id, name. Inlined key, value */ @JSImport("postman-collection", "FormParam")
@js.native
class FormParam protected () extends Property[FormParamDefinition] {
  def this(options: FormParamDefinition) = this()
  var key: js.UndefOr[String] = js.native
  var value: js.UndefOr[js.Any] = js.native
}

