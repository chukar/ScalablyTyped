package typings.reactDashRelay.libRelayDashExperimentalQueryResourceMod

import typings.relayDashRuntime.libNetworkRelayNetworkTypesMod.GraphQLResponse
import typings.relayDashRuntime.libNetworkRelayObservableMod.Observer
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.OperationDescriptor
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.Snapshot
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.Disposable
import typings.relayDashRuntime.relayDashRuntimeMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryResourceImpl extends js.Object {
  def getCacheEntry(operation: OperationDescriptor, fetchPolicy: FetchPolicy): QueryResourceCacheEntry | Null = js.native
  def getCacheEntry(operation: OperationDescriptor, fetchPolicy: FetchPolicy, maybeRenderPolicy: RenderPolicy): QueryResourceCacheEntry | Null = js.native
  def prepare(operation: OperationDescriptor, fetchObservable: Observable[GraphQLResponse]): QueryResult = js.native
  def prepare(
    operation: OperationDescriptor,
    fetchObservable: Observable[GraphQLResponse],
    maybeFetchPolicy: Null,
    maybeRenderPolicy: Null,
    observer: Observer[Snapshot]
  ): QueryResult = js.native
  def prepare(
    operation: OperationDescriptor,
    fetchObservable: Observable[GraphQLResponse],
    maybeFetchPolicy: Null,
    maybeRenderPolicy: Null,
    observer: Observer[Snapshot],
    cacheKeyBuster: String
  ): QueryResult = js.native
  def prepare(
    operation: OperationDescriptor,
    fetchObservable: Observable[GraphQLResponse],
    maybeFetchPolicy: Null,
    maybeRenderPolicy: Null,
    observer: Observer[Snapshot],
    cacheKeyBuster: Double
  ): QueryResult = js.native
  def prepare(
    operation: OperationDescriptor,
    fetchObservable: Observable[GraphQLResponse],
    maybeFetchPolicy: Null,
    maybeRenderPolicy: RenderPolicy
  ): QueryResult = js.native
  def prepare(
    operation: OperationDescriptor,
    fetchObservable: Observable[GraphQLResponse],
    maybeFetchPolicy: Null,
    maybeRenderPolicy: RenderPolicy,
    observer: Observer[Snapshot]
  ): QueryResult = js.native
  def prepare(
    operation: OperationDescriptor,
    fetchObservable: Observable[GraphQLResponse],
    maybeFetchPolicy: Null,
    maybeRenderPolicy: RenderPolicy,
    observer: Observer[Snapshot],
    cacheKeyBuster: String
  ): QueryResult = js.native
  def prepare(
    operation: OperationDescriptor,
    fetchObservable: Observable[GraphQLResponse],
    maybeFetchPolicy: Null,
    maybeRenderPolicy: RenderPolicy,
    observer: Observer[Snapshot],
    cacheKeyBuster: Double
  ): QueryResult = js.native
  def prepare(
    operation: OperationDescriptor,
    fetchObservable: Observable[GraphQLResponse],
    maybeFetchPolicy: FetchPolicy
  ): QueryResult = js.native
  def prepare(
    operation: OperationDescriptor,
    fetchObservable: Observable[GraphQLResponse],
    maybeFetchPolicy: FetchPolicy,
    maybeRenderPolicy: Null,
    observer: Observer[Snapshot]
  ): QueryResult = js.native
  def prepare(
    operation: OperationDescriptor,
    fetchObservable: Observable[GraphQLResponse],
    maybeFetchPolicy: FetchPolicy,
    maybeRenderPolicy: Null,
    observer: Observer[Snapshot],
    cacheKeyBuster: String
  ): QueryResult = js.native
  def prepare(
    operation: OperationDescriptor,
    fetchObservable: Observable[GraphQLResponse],
    maybeFetchPolicy: FetchPolicy,
    maybeRenderPolicy: Null,
    observer: Observer[Snapshot],
    cacheKeyBuster: Double
  ): QueryResult = js.native
  /**
    * This function should be called during a Component's render function,
    * to either read an existing cached value for the query, or fetch the query
    * and suspend.
    */
  def prepare(
    operation: OperationDescriptor,
    fetchObservable: Observable[GraphQLResponse],
    maybeFetchPolicy: FetchPolicy,
    maybeRenderPolicy: RenderPolicy
  ): QueryResult = js.native
  def prepare(
    operation: OperationDescriptor,
    fetchObservable: Observable[GraphQLResponse],
    maybeFetchPolicy: FetchPolicy,
    maybeRenderPolicy: RenderPolicy,
    observer: Observer[Snapshot]
  ): QueryResult = js.native
  def prepare(
    operation: OperationDescriptor,
    fetchObservable: Observable[GraphQLResponse],
    maybeFetchPolicy: FetchPolicy,
    maybeRenderPolicy: RenderPolicy,
    observer: Observer[Snapshot],
    cacheKeyBuster: String
  ): QueryResult = js.native
  def prepare(
    operation: OperationDescriptor,
    fetchObservable: Observable[GraphQLResponse],
    maybeFetchPolicy: FetchPolicy,
    maybeRenderPolicy: RenderPolicy,
    observer: Observer[Snapshot],
    cacheKeyBuster: Double
  ): QueryResult = js.native
  /**
    * This function should be called during a Component's commit phase
    * (e.g. inside useEffect), in order to retain the operation in the Relay store
    * and transfer ownership of the operation to the component lifecycle.
    */
  def retain(queryResult: QueryResult): Disposable = js.native
}

