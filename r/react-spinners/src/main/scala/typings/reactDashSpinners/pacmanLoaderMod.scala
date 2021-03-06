package typings.reactDashSpinners

import typings.atEmotionSerialize.atEmotionSerializeMod.Keyframes
import typings.react.reactMod.Component
import typings.reactDashSpinners.interfacesMod.CalcFunction
import typings.reactDashSpinners.interfacesMod.LoaderSizeMarginProps
import typings.reactDashSpinners.interfacesMod.StyleFunction
import typings.reactDashSpinners.interfacesMod.StyleFunctionWithIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-spinners/PacmanLoader", JSImport.Namespace)
@js.native
object pacmanLoaderMod extends js.Object {
  @js.native
  trait Loader
    extends Component[LoaderSizeMarginProps, js.Object, js.Any] {
    var ball: CalcFunction[Keyframes] = js.native
    var ballStyle: StyleFunctionWithIndex = js.native
    var man: StyleFunction = js.native
    var pac: StyleFunction = js.native
    var pacmanStyle: StyleFunctionWithIndex = js.native
    var s1: CalcFunction[String] = js.native
    var s2: CalcFunction[String] = js.native
    var wrapper: StyleFunction = js.native
  }
  
  @js.native
  class default () extends Loader
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: LoaderSizeMarginProps = js.native
  }
  
}

