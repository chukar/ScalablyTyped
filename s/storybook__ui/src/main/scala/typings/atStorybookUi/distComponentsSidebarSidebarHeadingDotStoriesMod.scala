package typings.atStorybookUi

import typings.atStorybookUi.distComponentsSidebarSidebarHeadingMod.SidebarHeadingProps
import typings.react.reactMod._Global_.JSX.Element
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/ui/dist/components/sidebar/SidebarHeading.stories", JSImport.Namespace)
@js.native
object distComponentsSidebarSidebarHeadingDotStoriesMod extends js.Object {
  def customBrandImage(): Element = js.native
  def linkAndText(): Element = js.native
  def longText(): Element = js.native
  def menuHighlighted(): Element = js.native
  def onlyText(): Element = js.native
  def standard(): Element = js.native
  def standardNoLink(): Element = js.native
  @js.native
  object default extends js.Object {
    var decorators: js.Array[js.Function1[/* storyFn */ _, Element]] = js.native
    var excludeStories: RegExp = js.native
    var title: String = js.native
    def component(hasMenuHighlightedMenuProps: SidebarHeadingProps): Element = js.native
  }
  
  @js.native
  object standardData extends js.Object {
    var menu: js.Array[Anon_Id] = js.native
  }
  
}

