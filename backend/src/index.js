const http = require('http');
const PORT = process.env.PORT || 3000;

// Helper function to parse URL
const parseUrl = (url) => {
  const urlObj = new URL(url, `http://localhost:${PORT}`);
  return {
    pathname: urlObj.pathname,
    searchParams: urlObj.searchParams
  };
};

// Create server
const server = http.createServer((req, res) => {
  const { pathname } = parseUrl(req.url);
  
  // Set CORS headers
  res.setHeader('Content-Type', 'application/json');
  res.setHeader('Access-Control-Allow-Origin', '*');
  
  // Routes
  if (req.method === 'GET' && pathname === '/') {
    res.writeHead(200);
    res.end(JSON.stringify({
      message: 'CI Backend API',
      status: 'running',
      timestamp: new Date().toISOString()
    }));
  } else if (req.method === 'GET' && pathname === '/health') {
    res.writeHead(200);
    res.end(JSON.stringify({
      status: 'healthy',
      uptime: process.uptime(),
      timestamp: new Date().toISOString()
    }));
  } else if (req.method === 'GET' && pathname === '/api/info') {
    res.writeHead(200);
    res.end(JSON.stringify({
      name: 'CI Backend',
      version: '1.0.0',
      environment: process.env.NODE_ENV || 'development'
    }));
  } else {
    res.writeHead(404);
    res.end(JSON.stringify({
      error: 'Not Found',
      message: `Cannot ${req.method} ${pathname}`
    }));
  }
});

// Start server
server.listen(PORT, '0.0.0.0', () => {
  console.log(`Server is running on port ${PORT}`);
  console.log(`Environment: ${process.env.NODE_ENV || 'development'}`);
});

