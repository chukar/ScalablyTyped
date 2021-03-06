package typings.atFirebaseFirestore.distSrcLocalSharedUnderscoreClientUnderscoreStateUnderscoreSyncerMod

import typings.atFirebaseFirestore.distSrcCoreTypesMod.BatchId
import typings.atFirebaseFirestore.distSrcCoreTypesMod.MutationBatchState
import typings.atFirebaseFirestore.distSrcCoreTypesMod.TargetId
import typings.atFirebaseFirestore.distSrcLocalSharedUnderscoreClientUnderscoreStateMod.ClientId
import typings.atFirebaseFirestore.distSrcUtilErrorMod.FirestoreError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedClientStateSyncer extends js.Object {
  /** Adds or removes Watch targets for queries from different tabs. */
  def applyActiveTargetsChange(added: js.Array[TargetId], removed: js.Array[TargetId]): js.Promise[Unit] = js.native
  /** Applies a mutation state to an existing batch.  */
  def applyBatchState(batchId: BatchId, state: MutationBatchState): js.Promise[Unit] = js.native
  def applyBatchState(batchId: BatchId, state: MutationBatchState, error: FirestoreError): js.Promise[Unit] = js.native
  /** Applies a query target change from a different tab. */
  def applyTargetState(targetId: TargetId, state: QueryTargetState): js.Promise[Unit] = js.native
  def applyTargetState(targetId: TargetId, state: QueryTargetState, error: FirestoreError): js.Promise[Unit] = js.native
  /** Returns the IDs of the clients that are currently active. */
  def getActiveClients(): js.Promise[js.Array[ClientId]] = js.native
}

