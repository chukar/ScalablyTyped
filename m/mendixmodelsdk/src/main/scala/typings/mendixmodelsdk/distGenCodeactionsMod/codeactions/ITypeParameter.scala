package typings.mendixmodelsdk.distGenCodeactionsMod.codeactions

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distSdkInternalElementsMod.IByNameReferrable
import typings.mendixmodelsdk.distSdkInternalElementsMod.IElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.21.0: introduced
  */
@js.native
trait ITypeParameter
  extends IElement
     with IByNameReferrable {
  val containerAsCodeAction: ICodeAction = js.native
  @JSName("model")
  val model_ITypeParameter: IModel = js.native
  val name: String = js.native
}

