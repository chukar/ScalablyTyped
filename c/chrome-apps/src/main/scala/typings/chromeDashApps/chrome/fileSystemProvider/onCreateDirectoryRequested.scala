package typings.chromeDashApps.chrome.fileSystemProvider

import org.scalablytyped.runtime.TopLevel
import typings.chromeDashApps.Anon_ABORT
import typings.chromeDashApps.chrome.ToStringLiteral
import typings.chromeDashApps.chrome.events.Event
import typings.chromeDashApps.chromeDashAppsStrings.ABORT
import typings.chromeDashApps.chromeDashAppsStrings.ACCESS_DENIED
import typings.chromeDashApps.chromeDashAppsStrings.EXISTS
import typings.chromeDashApps.chromeDashAppsStrings.FAILED
import typings.chromeDashApps.chromeDashAppsStrings.INVALID_OPERATION
import typings.chromeDashApps.chromeDashAppsStrings.INVALID_URL
import typings.chromeDashApps.chromeDashAppsStrings.IN_USE
import typings.chromeDashApps.chromeDashAppsStrings.IO
import typings.chromeDashApps.chromeDashAppsStrings.NOT_A_DIRECTORY
import typings.chromeDashApps.chromeDashAppsStrings.NOT_A_FILE
import typings.chromeDashApps.chromeDashAppsStrings.NOT_EMPTY
import typings.chromeDashApps.chromeDashAppsStrings.NOT_FOUND
import typings.chromeDashApps.chromeDashAppsStrings.NO_MEMORY
import typings.chromeDashApps.chromeDashAppsStrings.NO_SPACE
import typings.chromeDashApps.chromeDashAppsStrings.OK
import typings.chromeDashApps.chromeDashAppsStrings.SECURITY
import typings.chromeDashApps.chromeDashAppsStrings.TOO_MANY_OPENED
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Raised when creating a directory is requested.
  * The operation must fail with the EXISTS error if the target directory already exists.
  * If recursive is true, then all of the missing directories on the directory path must be created.
  * @see ProviderError
  */
@JSGlobal("chrome.fileSystemProvider.onCreateDirectoryRequested")
@js.native
object onCreateDirectoryRequested
  extends TopLevel[
      Event[
        js.Function3[
          /* options */ CreateDirectoryRequestedEventOptions, 
          /* successCallback */ js.Function0[Unit], 
          /* errorCallback */ js.Function1[
            /* error */ ToStringLiteral[
              Anon_ABORT, 
              String, 
              Exclude[
                String, 
                INVALID_URL | IN_USE | OK | ABORT | SECURITY | NOT_A_DIRECTORY | NOT_A_FILE | INVALID_OPERATION | TOO_MANY_OPENED | NO_MEMORY | ACCESS_DENIED | NOT_FOUND | FAILED | NO_SPACE | EXISTS | NOT_EMPTY | IO
              ]
            ], 
            Unit
          ], 
          Unit
        ]
      ]
    ]

