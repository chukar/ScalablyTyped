package typings.adone.adoneNs.fsNs.INs.GlobNs

import typings.adone.adoneNs.fsNs.INs.Stats
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Set to true to always receive absolute paths for matched files
    */
  var absolute: js.UndefOr[Boolean] = js.undefined
  /**
    * Pass in a previously generated cache object to save some fs calls
    */
  var cache: js.UndefOr[Map[String, String]] = js.undefined
  /**
    * The current working directory in which to search. Defaults to process.cwd()
    */
  var cwd: js.UndefOr[String] = js.undefined
  /**
    * Include .dot files in normal matches and globstar matches
    */
  var dot: js.UndefOr[Boolean] = js.undefined
  /**
    * Follow symlinked directories when expanding ** patterns.
    * Note that this can result in a lot of duplicate references in the presence of cyclic links
    */
  var follow: js.UndefOr[Boolean] = js.undefined
  /**
    * Add a pattern or an array of glob patterns to exclude matches
    */
  var ignore: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * Add a / character to directory matches. Note that this requires additional stat calls
    */
  var mark: js.UndefOr[Boolean] = js.undefined
  /**
    * Perform a basename-only match if the pattern does not contain any slash characters.
    * That is, *.js would be treated as equivalent to **\/ *.js, matching all js files in all directories
    */
  var matchBase: js.UndefOr[Boolean] = js.undefined
  /**
    * Do not expand {a,b} and {1..3} brace sets.
    */
  var nobrace: js.UndefOr[Boolean] = js.undefined
  /**
    * Perform a case-insensitive match.
    * Note: on case-insensitive filesystems, non-magic patterns will match by default, since stat and readdir will not raise errors.
    */
  var nocase: js.UndefOr[Boolean] = js.undefined
  /**
    * Do not match directories, only files
    */
  var nodir: js.UndefOr[Boolean] = js.undefined
  /**
    * Do not match +(a|b) "extglob" patterns.
    */
  var noext: js.UndefOr[Boolean] = js.undefined
  /**
    * Do not match ** against multiple filenames. (Ie, treat it as a normal * instead.)
    */
  var noglobstar: js.UndefOr[Boolean] = js.undefined
  /**
    * By default, a pattern starting with a forward-slash will be "mounted" onto the root setting,
    * so that a valid filesystem path is returned
    */
  var nomount: js.UndefOr[Boolean] = js.undefined
  /**
    * Set to never return an empty set, instead returning a set containing the pattern itself.
    * This is the default in glob(3).
    */
  var nonull: js.UndefOr[Boolean] = js.undefined
  /**
    * Don't sort the results
    */
  var nosort: js.UndefOr[Boolean] = js.undefined
  /**
    * In some cases, brace-expanded patterns can result in the same file showing up multiple times in the result set.
    * By default, this implementation prevents duplicates in the result set.
    * Set this flag to disable that behavior
    */
  var nounique: js.UndefOr[Boolean] = js.undefined
  /**
    * Set to true to call fs.realpath on all of the results
    */
  var realpath: js.UndefOr[Boolean] = js.undefined
  /**
    * A cache of results of filesystem information, to prevent unnecessary realpath calls
    */
  var realpathCache: js.UndefOr[Map[String, String]] = js.undefined
  /**
    * The place where patterns starting with / will be mounted onto
    */
  var root: js.UndefOr[String] = js.undefined
  /**
    * When an unusual error is encountered when attempting to read a directory, a warning will be printed to stderr.
    * Set the option to true to suppress these warnings.
    */
  var silent: js.UndefOr[Boolean] = js.undefined
  /**
    * Set to true to stat all results
    */
  var stat: js.UndefOr[Boolean] = js.undefined
  /**
    * A cache of results of filesystem information, to prevent unnecessary stat calls
    */
  var statCache: js.UndefOr[Map[String, Stats]] = js.undefined
  /**
    * When an unusual error is encountered when attempting to read a directory,
    * the process will just continue on in search of other matches.
    * Set the option to raise an error in these cases
    */
  var strict: js.UndefOr[Boolean] = js.undefined
  /**
    * A cache of known symbolic links
    */
  var symlinks: js.UndefOr[js.Object] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    absolute: js.UndefOr[Boolean] = js.undefined,
    cache: Map[String, String] = null,
    cwd: String = null,
    dot: js.UndefOr[Boolean] = js.undefined,
    follow: js.UndefOr[Boolean] = js.undefined,
    ignore: String | js.Array[String] = null,
    mark: js.UndefOr[Boolean] = js.undefined,
    matchBase: js.UndefOr[Boolean] = js.undefined,
    nobrace: js.UndefOr[Boolean] = js.undefined,
    nocase: js.UndefOr[Boolean] = js.undefined,
    nodir: js.UndefOr[Boolean] = js.undefined,
    noext: js.UndefOr[Boolean] = js.undefined,
    noglobstar: js.UndefOr[Boolean] = js.undefined,
    nomount: js.UndefOr[Boolean] = js.undefined,
    nonull: js.UndefOr[Boolean] = js.undefined,
    nosort: js.UndefOr[Boolean] = js.undefined,
    nounique: js.UndefOr[Boolean] = js.undefined,
    realpath: js.UndefOr[Boolean] = js.undefined,
    realpathCache: Map[String, String] = null,
    root: String = null,
    silent: js.UndefOr[Boolean] = js.undefined,
    stat: js.UndefOr[Boolean] = js.undefined,
    statCache: Map[String, Stats] = null,
    strict: js.UndefOr[Boolean] = js.undefined,
    symlinks: js.Object = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(absolute)) __obj.updateDynamic("absolute")(absolute)
    if (cache != null) __obj.updateDynamic("cache")(cache)
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (!js.isUndefined(dot)) __obj.updateDynamic("dot")(dot)
    if (!js.isUndefined(follow)) __obj.updateDynamic("follow")(follow)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(mark)) __obj.updateDynamic("mark")(mark)
    if (!js.isUndefined(matchBase)) __obj.updateDynamic("matchBase")(matchBase)
    if (!js.isUndefined(nobrace)) __obj.updateDynamic("nobrace")(nobrace)
    if (!js.isUndefined(nocase)) __obj.updateDynamic("nocase")(nocase)
    if (!js.isUndefined(nodir)) __obj.updateDynamic("nodir")(nodir)
    if (!js.isUndefined(noext)) __obj.updateDynamic("noext")(noext)
    if (!js.isUndefined(noglobstar)) __obj.updateDynamic("noglobstar")(noglobstar)
    if (!js.isUndefined(nomount)) __obj.updateDynamic("nomount")(nomount)
    if (!js.isUndefined(nonull)) __obj.updateDynamic("nonull")(nonull)
    if (!js.isUndefined(nosort)) __obj.updateDynamic("nosort")(nosort)
    if (!js.isUndefined(nounique)) __obj.updateDynamic("nounique")(nounique)
    if (!js.isUndefined(realpath)) __obj.updateDynamic("realpath")(realpath)
    if (realpathCache != null) __obj.updateDynamic("realpathCache")(realpathCache)
    if (root != null) __obj.updateDynamic("root")(root)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    if (!js.isUndefined(stat)) __obj.updateDynamic("stat")(stat)
    if (statCache != null) __obj.updateDynamic("statCache")(statCache)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    if (symlinks != null) __obj.updateDynamic("symlinks")(symlinks)
    __obj.asInstanceOf[Options]
  }
}

