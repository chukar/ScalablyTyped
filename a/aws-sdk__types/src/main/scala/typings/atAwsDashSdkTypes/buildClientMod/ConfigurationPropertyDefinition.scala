package typings.atAwsDashSdkTypes.buildClientMod

import org.scalablytyped.runtime.StringDictionary
import typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigurationPropertyDefinition[InputType, ResolvedType /* <: InputType */, ServiceConfiguration /* <: StringDictionary[js.Any] */, ResolvedConfiguration /* <: ServiceConfiguration */] extends js.Object {
  /**
    * A function that finalizes the value supplied and/or alters the client
    * configuration or middleware stack in reaction to it.
    */
  @JSName("apply")
  var apply: js.UndefOr[ConfigApplicator[ResolvedConfiguration]] = js.undefined
  /**
    * A function that returns a default value for this property. It will be
    * called if no value is supplied.
    */
  var defaultProvider: js.UndefOr[js.Function1[/* config */ ResolvedConfiguration, ResolvedType]] = js.undefined
  /**
    * A static value to use as the default should none be supplied.
    */
  var defaultValue: js.UndefOr[ResolvedType] = js.undefined
  /**
    * A function that normalizes input to the subtype expected by the SDK.
    */
  var normalize: js.UndefOr[
    js.Function2[/* value */ InputType, /* config */ Partial[ResolvedConfiguration], ResolvedType]
  ] = js.undefined
  /**
    * Whether this property must be supplied by the user of a client. If value
    * must be resolved but a default is available, this property should be
    * `false` or undefined.
    */
  var required: js.UndefOr[Boolean] = js.undefined
}

object ConfigurationPropertyDefinition {
  @scala.inline
  def apply[InputType, ResolvedType /* <: InputType */, ServiceConfiguration /* <: StringDictionary[js.Any] */, ResolvedConfiguration /* <: ServiceConfiguration */](
    apply: (ResolvedConfiguration, /* clientMiddlewareStack */ MiddlewareStack[js.Any, js.Any, js.Any]) => Unit = null,
    defaultProvider: /* config */ ResolvedConfiguration => ResolvedType = null,
    defaultValue: ResolvedType = null,
    normalize: (/* value */ InputType, /* config */ Partial[ResolvedConfiguration]) => ResolvedType = null,
    required: js.UndefOr[Boolean] = js.undefined
  ): ConfigurationPropertyDefinition[InputType, ResolvedType, ServiceConfiguration, ResolvedConfiguration] = {
    val __obj = js.Dynamic.literal()
    if (apply != null) __obj.updateDynamic("apply")(js.Any.fromFunction2(apply))
    if (defaultProvider != null) __obj.updateDynamic("defaultProvider")(js.Any.fromFunction1(defaultProvider))
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (normalize != null) __obj.updateDynamic("normalize")(js.Any.fromFunction2(normalize))
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationPropertyDefinition[InputType, ResolvedType, ServiceConfiguration, ResolvedConfiguration]]
  }
}

