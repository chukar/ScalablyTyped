package typings.googleapis.buildSrcApisRemotebuildexecutionV1Mod.remotebuildexecution_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `Command` is the actual command executed by a worker running an Action
  * and specifications of its environment.  Except as otherwise required, the
  * environment (such as which system libraries or binaries are available, and
  * what filesystems are mounted where) is defined by and specific to the
  * implementation of the remote execution API.
  */
@js.native
trait Schema$BuildBazelRemoteExecutionV2Command extends js.Object {
  /**
    * The arguments to the command. The first argument must be the path to the
    * executable, which must be either a relative path, in which case it is
    * evaluated with respect to the input root, or an absolute path.
    */
  var arguments: js.UndefOr[js.Array[String]] = js.native
  /**
    * The environment variables to set when running the program. The worker may
    * provide its own default environment variables; these defaults can be
    * overridden using this field. Additional variables can also be specified.
    * In order to ensure that equivalent Commands always hash to the same
    * value, the environment variables MUST be lexicographically sorted by
    * name. Sorting of strings is done by code point, equivalently, by the
    * UTF-8 bytes.
    */
  var environmentVariables: js.UndefOr[js.Array[Schema$BuildBazelRemoteExecutionV2CommandEnvironmentVariable]] = js.native
  /**
    * A list of the output directories that the client expects to retrieve from
    * the action. Only the listed directories will be returned (an entire
    * directory structure will be returned as a Tree message digest, see
    * OutputDirectory), as well as files listed in `output_files`. Other files
    * or directories that may be created during command execution are
    * discarded.  The paths are relative to the working directory of the action
    * execution. The paths are specified using a single forward slash (`/`) as
    * a path separator, even if the execution platform natively uses a
    * different separator. The path MUST NOT include a trailing slash, nor a
    * leading slash, being a relative path. The special value of empty string
    * is allowed, although not recommended, and can be used to capture the
    * entire working directory tree, including inputs.  In order to ensure
    * consistent hashing of the same Action, the output paths MUST be sorted
    * lexicographically by code point (or, equivalently, by UTF-8 bytes).  An
    * output directory cannot be duplicated or have the same path as any of the
    * listed output files.  Directories leading up to the output directories
    * (but not the output directories themselves) are created by the worker
    * prior to execution, even if they are not explicitly part of the input
    * root.
    */
  var outputDirectories: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of the output files that the client expects to retrieve from the
    * action. Only the listed files, as well as directories listed in
    * `output_directories`, will be returned to the client as output. Other
    * files or directories that may be created during command execution are
    * discarded.  The paths are relative to the working directory of the action
    * execution. The paths are specified using a single forward slash (`/`) as
    * a path separator, even if the execution platform natively uses a
    * different separator. The path MUST NOT include a trailing slash, nor a
    * leading slash, being a relative path.  In order to ensure consistent
    * hashing of the same Action, the output paths MUST be sorted
    * lexicographically by code point (or, equivalently, by UTF-8 bytes).  An
    * output file cannot be duplicated, be a parent of another output file, or
    * have the same path as any of the listed output directories.  Directories
    * leading up to the output files are created by the worker prior to
    * execution, even if they are not explicitly part of the input root.
    */
  var outputFiles: js.UndefOr[js.Array[String]] = js.native
  /**
    * The platform requirements for the execution environment. The server MAY
    * choose to execute the action on any worker satisfying the requirements,
    * so the client SHOULD ensure that running the action on any such worker
    * will have the same result.
    */
  var platform: js.UndefOr[Schema$BuildBazelRemoteExecutionV2Platform] = js.native
  /**
    * The working directory, relative to the input root, for the command to run
    * in. It must be a directory which exists in the input tree. If it is left
    * empty, then the action is run in the input root.
    */
  var workingDirectory: js.UndefOr[String] = js.native
}

object Schema$BuildBazelRemoteExecutionV2Command {
  @scala.inline
  def apply(
    arguments: js.Array[String] = null,
    environmentVariables: js.Array[Schema$BuildBazelRemoteExecutionV2CommandEnvironmentVariable] = null,
    outputDirectories: js.Array[String] = null,
    outputFiles: js.Array[String] = null,
    platform: Schema$BuildBazelRemoteExecutionV2Platform = null,
    workingDirectory: String = null
  ): Schema$BuildBazelRemoteExecutionV2Command = {
    val __obj = js.Dynamic.literal()
    if (arguments != null) __obj.updateDynamic("arguments")(arguments.asInstanceOf[js.Any])
    if (environmentVariables != null) __obj.updateDynamic("environmentVariables")(environmentVariables.asInstanceOf[js.Any])
    if (outputDirectories != null) __obj.updateDynamic("outputDirectories")(outputDirectories.asInstanceOf[js.Any])
    if (outputFiles != null) __obj.updateDynamic("outputFiles")(outputFiles.asInstanceOf[js.Any])
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (workingDirectory != null) __obj.updateDynamic("workingDirectory")(workingDirectory.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BuildBazelRemoteExecutionV2Command]
  }
}

