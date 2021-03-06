package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cached module resolutions per containing directory.
  * This assumes that any module id will have the same resolution for sibling files located in the same folder.
  */
@js.native
trait ModuleResolutionCache extends NonRelativeModuleNameResolutionCache {
  def getOrCreateCacheForDirectory(directoryName: String): Map[ResolvedModuleWithFailedLookupLocations] = js.native
  def getOrCreateCacheForDirectory(directoryName: String, redirectedReference: ResolvedProjectReference): Map[ResolvedModuleWithFailedLookupLocations] = js.native
}

