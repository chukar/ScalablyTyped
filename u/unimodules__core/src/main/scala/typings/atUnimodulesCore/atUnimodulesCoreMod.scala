package typings.atUnimodulesCore

import org.scalablytyped.runtime.StringDictionary
import typings.atUnimodulesCore.atUnimodulesCoreStrings.android
import typings.atUnimodulesCore.atUnimodulesCoreStrings.ios
import typings.atUnimodulesCore.atUnimodulesCoreStrings.macos
import typings.atUnimodulesCore.atUnimodulesCoreStrings.web
import typings.atUnimodulesCore.atUnimodulesCoreStrings.windows
import typings.atUnimodulesReactDashNativeDashAdapter.buildEventEmitterMod.NativeModule
import typings.atUnimodulesReactDashNativeDashAdapter.buildNativeModulesProxyMod.ProxyNativeModule
import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@unimodules/core", JSImport.Namespace)
@js.native
object atUnimodulesCoreMod extends js.Object {
  @js.native
  class CodedError protected ()
    extends typings.atUnimodulesCore.buildAdapterProxyMod.CodedError {
    def this(code: String, message: String) = this()
  }
  
  @js.native
  class EventEmitter protected ()
    extends typings.atUnimodulesCore.buildAdapterProxyMod.EventEmitter {
    def this(nativeModule: NativeModule) = this()
  }
  
  @js.native
  class UnavailabilityError protected ()
    extends typings.atUnimodulesCore.buildAdapterProxyMod.UnavailabilityError {
    def this(moduleName: String, propertyName: String) = this()
  }
  
  val SyntheticPlatformEmitter: typings.atUnimodulesReactDashNativeDashAdapter.buildSyntheticPlatformEmitterMod.SyntheticPlatformEmitter = js.native
  def deprecate(library: String, deprecatedAPI: String): Unit = js.native
  def deprecate(library: String, deprecatedAPI: String, options: Anon_CurrentVersion): Unit = js.native
  def requireNativeViewManager[P](viewName: String): ComponentType[P] = js.native
  @js.native
  object NativeModulesProxy extends /* moduleName */ StringDictionary[ProxyNativeModule]
  
  @js.native
  object Platform extends js.Object {
    var OS: ios | android | windows | macos | web = js.native
  }
  
}

