package typings.reactDashIntl.libComponentsRelativeMod

import typings.reactDashIntl.reactDashIntlStrings.unit
import typings.reactDashIntl.reactDashIntlStrings.value
import typings.std.Partial
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-intl/lib/components/relative", JSImport.Default)
@js.native
class default protected () extends FormattedRelativeTime {
  def this(props: Props) = this()
}

/* static members */
@JSImport("react-intl/lib/components/relative", JSImport.Default)
@js.native
object default extends js.Object {
  var defaultProps: Pick[Props, unit | value] = js.native
  var displayName: String = js.native
  def getDerivedStateFromProps(props: Props, state: State): Partial[State] | Null = js.native
}

