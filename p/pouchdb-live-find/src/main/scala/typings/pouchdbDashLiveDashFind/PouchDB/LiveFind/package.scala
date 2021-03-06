package typings.pouchdbDashLiveDashFind.PouchDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object LiveFind {
  import typings.pouchdbDashFind.PouchDB.Find.FindRequest
  import typings.pouchdbDashLiveDashFind.pouchdbDashLiveDashFindStrings.limit
  import typings.pouchdbDashLiveDashFind.pouchdbDashLiveDashFindStrings.skip
  import typings.pouchdbDashLiveDashFind.pouchdbDashLiveDashFindStrings.sort
  import typings.std.Pick

  type PaginateOptions[Content /* <: js.Object */] = Pick[FindRequest[Content], sort | skip | limit]
}
