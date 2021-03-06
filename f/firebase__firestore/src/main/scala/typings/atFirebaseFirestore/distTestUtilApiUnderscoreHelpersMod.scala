package typings.atFirebaseFirestore

import org.scalablytyped.runtime.StringDictionary
import typings.atFirebaseFirestore.distSrcApiDatabaseMod.CollectionReference
import typings.atFirebaseFirestore.distSrcApiDatabaseMod.DocumentReference
import typings.atFirebaseFirestore.distSrcApiDatabaseMod.DocumentSnapshot
import typings.atFirebaseFirestore.distSrcApiDatabaseMod.Firestore
import typings.atFirebaseFirestore.distSrcApiDatabaseMod.Query
import typings.atFirebaseFirestore.distSrcApiDatabaseMod.QuerySnapshot
import typings.atFirebaseFirestore.distSrcModelCollectionsMod.DocumentKeySet
import typings.atFirebaseFirestore.distSrcModelFieldUnderscoreValueMod.JsonObject
import typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.DocumentData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/test/util/api_helpers", JSImport.Namespace)
@js.native
object distTestUtilApiUnderscoreHelpersMod extends js.Object {
  val FIRESTORE: Firestore = js.native
  def collectionReference(path: String): CollectionReference[DocumentData] = js.native
  def documentReference(path: String): DocumentReference[DocumentData] = js.native
  def documentSnapshot(path: String, data: Null, fromCache: Boolean): DocumentSnapshot[DocumentData] = js.native
  def documentSnapshot(path: String, data: JsonObject[_], fromCache: Boolean): DocumentSnapshot[DocumentData] = js.native
  def firestore(): Firestore = js.native
  def query(path: String): Query[DocumentData] = js.native
  def querySnapshot(
    path: String,
    oldDocs: StringDictionary[JsonObject[_]],
    docsToAdd: StringDictionary[JsonObject[_]],
    mutatedKeys: DocumentKeySet,
    fromCache: Boolean,
    syncStateChanged: Boolean
  ): QuerySnapshot[DocumentData] = js.native
}

