package typings.reactDashIntl.reactDashIntlMod

import typings.react.reactMod.Component
import typings.reactDashIntl.reactDashIntlStrings.defaultFormats
import typings.reactDashIntl.reactDashIntlStrings.defaultLocale
import typings.reactDashIntl.reactDashIntlStrings.formats
import typings.reactDashIntl.reactDashIntlStrings.messages
import typings.reactDashIntl.reactDashIntlStrings.onError
import typings.reactDashIntl.reactDashIntlStrings.textComponent
import typings.reactDashIntl.reactDashIntlStrings.timeZone
import typings.std.Partial
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-intl", "IntlProvider")
@js.native
class IntlProvider ()
  extends Component[OptionalIntlConfig, State, js.Any] {
  var cache: js.Any = js.native
}

/* static members */
@JSImport("react-intl", "IntlProvider")
@js.native
object IntlProvider extends js.Object {
  var defaultProps: Pick[
    IntlConfig, 
    formats | messages | timeZone | textComponent | defaultLocale | defaultFormats | onError
  ] = js.native
  var displayName: String = js.native
  def getDerivedStateFromProps(props: OptionalIntlConfig, hasPrevConfigCache: State): Partial[State] | Null = js.native
}

