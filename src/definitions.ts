declare module '@capacitor/core' {
  interface PluginRegistry {
    WidgetCommunicator: WidgetCommunicatorPlugin;
  }
}

export interface WidgetCommunicatorPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
