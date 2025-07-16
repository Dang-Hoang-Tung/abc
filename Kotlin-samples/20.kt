// Platform Interop: Call Objective-C from KMP (iOS)

// Requires linking and correctly configuring Apple frameworks via KMP and Xcode integration.

// commonMain
expect fun getDeviceModel(): String

// iosMain
actual fun getDeviceModel(): String {
    return UIDevice.currentDevice.model ?: "Unknown"
}
