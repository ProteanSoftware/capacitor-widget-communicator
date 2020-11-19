declare module '@capacitor/core' {
  interface PluginRegistry {
    WidgetCommunicator: WidgetCommunicatorPlugin;
  }
}

export interface WidgetCommunicatorPlugin {
  updateWidgetData(options: { data: any[] }): Promise<void>;
}
