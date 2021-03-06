package typings.reactDashRelay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashRelayMod {
  import typings.react.reactMod.Component
  import typings.react.reactMod.ComponentType
  import typings.reactDashRelay.Anon_CacheConfig
  import typings.reactDashRelay.Anon_ComponentRef
  import typings.reactDashRelay.reactDashRelayStrings.relay
  import typings.relayDashRuntime.libNetworkRelayObservableMod.Observer
  import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.OperationType
  import typings.relayDashRuntime.relayDashRuntimeMod._FragmentRefs
  import typings.std.Error
  import typings.std.Exclude
  import typings.std.Pick

  type Container[Props] = ComponentType[ContainerProps[Props] with Anon_ComponentRef]
  type ContainerProps[Props] = MappedFragmentProps[Pick[Props, Exclude[String, relay]]]
  type FragmentOrRegularProp[T] = T | js.Array[_FragmentRefs[js.Any]] | _FragmentRefs[js.Any]
  type MappedFragmentProps[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: react-relay.react-relay.FragmentOrRegularProp<T[K]>}
    */ typings.reactDashRelay.reactDashRelayStrings.MappedFragmentProps with T
  type ObserverOrCallback = Observer[Unit] | (js.Function1[/* error */ js.UndefOr[Error | Null], Unit])
  type ReactRelayLocalQueryRenderer[TOperation /* <: OperationType */] = Component[QueryRendererProps[TOperation], js.Object, js.Any]
  type ReactRelayQueryRenderer[TOperation /* <: OperationType */] = Component[Anon_CacheConfig with QueryRendererProps[TOperation], js.Object, js.Any]
}
