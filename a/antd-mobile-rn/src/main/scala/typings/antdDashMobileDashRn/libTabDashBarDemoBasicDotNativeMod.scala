package typings.antdDashMobileDashRn

import typings.react.reactMod.Component
import typings.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd-mobile-rn/lib/tab-bar/demo/basic.native", JSImport.Namespace)
@js.native
object libTabDashBarDemoBasicDotNativeMod extends js.Object {
  @js.native
  trait BasicTabBarExample
    extends Component[js.Any, js.Any, js.Any] {
    def onChangeTab(tabName: js.Any): Unit = js.native
    def renderContent(pageText: js.Any): Element = js.native
  }
  
  @js.native
  class default protected () extends BasicTabBarExample {
    def this(props: js.Any) = this()
  }
  
}

