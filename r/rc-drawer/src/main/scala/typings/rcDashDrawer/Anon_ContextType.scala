package typings.rcDashDrawer

import typings.react.reactMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContextType extends js.Object {
  var contextType: js.UndefOr[Context[_]] = js.undefined
  var defaultProps: Anon_SwitchScrollingEffect
  var getDerivedStateFromProps: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DrawerChild.getDerivedStateFromProps */ js.Any
}

object Anon_ContextType {
  @scala.inline
  def apply(
    defaultProps: Anon_SwitchScrollingEffect,
    getDerivedStateFromProps: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DrawerChild.getDerivedStateFromProps */ js.Any,
    contextType: Context[_] = null
  ): Anon_ContextType = {
    val __obj = js.Dynamic.literal(defaultProps = defaultProps.asInstanceOf[js.Any], getDerivedStateFromProps = getDerivedStateFromProps.asInstanceOf[js.Any])
    if (contextType != null) __obj.updateDynamic("contextType")(contextType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ContextType]
  }
}

