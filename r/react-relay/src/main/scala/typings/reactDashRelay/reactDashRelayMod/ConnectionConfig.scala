package typings.reactDashRelay.reactDashRelayMod

import typings.reactDashRelay.Anon_Count
import typings.reactDashRelay.reactDashRelayStrings.backward
import typings.reactDashRelay.reactDashRelayStrings.forward
import typings.relayDashRuntime.libQueryRelayModernGraphQLTagMod.GraphQLTaggedNode
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionConfig[Props] extends js.Object {
  var direction: js.UndefOr[backward | forward] = js.undefined
  var getConnectionFromProps: js.UndefOr[js.Function1[/* props */ Props, js.UndefOr[ConnectionData | Null]]] = js.undefined
  var getFragmentVariables: js.UndefOr[js.Function2[/* prevVars */ Variables, /* totalCount */ Double, Variables]] = js.undefined
  var query: GraphQLTaggedNode
  def getVariables(props: Props, paginationInfo: Anon_Count, fragmentVariables: Variables): Variables
}

object ConnectionConfig {
  @scala.inline
  def apply[Props](
    getVariables: (Props, Anon_Count, Variables) => Variables,
    query: GraphQLTaggedNode,
    direction: backward | forward = null,
    getConnectionFromProps: /* props */ Props => js.UndefOr[ConnectionData | Null] = null,
    getFragmentVariables: (/* prevVars */ Variables, /* totalCount */ Double) => Variables = null
  ): ConnectionConfig[Props] = {
    val __obj = js.Dynamic.literal(getVariables = js.Any.fromFunction3(getVariables), query = query.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (getConnectionFromProps != null) __obj.updateDynamic("getConnectionFromProps")(js.Any.fromFunction1(getConnectionFromProps))
    if (getFragmentVariables != null) __obj.updateDynamic("getFragmentVariables")(js.Any.fromFunction2(getFragmentVariables))
    __obj.asInstanceOf[ConnectionConfig[Props]]
  }
}

