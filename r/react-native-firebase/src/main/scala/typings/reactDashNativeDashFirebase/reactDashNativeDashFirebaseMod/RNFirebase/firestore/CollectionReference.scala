package typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.firestore

import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.firestore.Query.Observer
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.firestore.Query.ObserverOnError
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.firestore.Query.ObserverOnNext
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.firestore.Types.GetOptions
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.firestore.Types.QueryDirection
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.firestore.Types.QueryOperator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionReference extends js.Object {
  val firestore: Firestore = js.native
  val id: String = js.native
  val parent: DocumentReference = js.native
  val path: String = js.native
  def add(data: js.Object): js.Promise[DocumentReference] = js.native
  def doc(): DocumentReference = js.native
  def doc(documentPath: String): DocumentReference = js.native
  def endAt(snapshot: DocumentSnapshot): Query = js.native
  def endAt(varargs: js.Any*): Query = js.native
  def endBefore(snapshot: DocumentSnapshot): Query = js.native
  def endBefore(varargs: js.Any*): Query = js.native
  def get(): js.Promise[QuerySnapshot] = js.native
  def get(options: GetOptions): js.Promise[QuerySnapshot] = js.native
  def isEqual(otherCollectionReference: CollectionReference): Boolean = js.native
  def limit(limit: Double): Query = js.native
  def onSnapshot(metadataChanges: MetadataChanges, observer: Observer): js.Function0[Unit] = js.native
  def onSnapshot(metadataChanges: MetadataChanges, onNext: ObserverOnNext): js.Function0[Unit] = js.native
  def onSnapshot(metadataChanges: MetadataChanges, onNext: ObserverOnNext, onError: ObserverOnError): js.Function0[Unit] = js.native
  def onSnapshot(observer: Observer): js.Function0[Unit] = js.native
  def onSnapshot(onNext: ObserverOnNext): js.Function0[Unit] = js.native
  def onSnapshot(onNext: ObserverOnNext, onError: ObserverOnError): js.Function0[Unit] = js.native
  def orderBy(fieldPath: String): Query = js.native
  def orderBy(fieldPath: String, directionStr: QueryDirection): Query = js.native
  def orderBy(fieldPath: FieldPath): Query = js.native
  def orderBy(fieldPath: FieldPath, directionStr: QueryDirection): Query = js.native
  def startAfter(snapshot: DocumentSnapshot): Query = js.native
  def startAfter(varargs: js.Any*): Query = js.native
  def startAt(snapshot: DocumentSnapshot): Query = js.native
  def startAt(varargs: js.Any*): Query = js.native
  def where(fieldPath: String, op: QueryOperator, value: js.Any): Query = js.native
  def where(fieldPath: FieldPath, op: QueryOperator, value: js.Any): Query = js.native
}

